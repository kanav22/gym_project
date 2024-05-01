// Import statements
import android.content.Context
import com.google.gson.JsonParser
import com.wadhawan.mcp.gymsharkhomework.config.CDN_URL
import com.wadhawan.mcp.gymsharkhomework.data.InfoLoader.Companion.parseProductList
import com.wadhawan.mcp.gymsharkhomework.data.log.LogUtil.debug
import com.wadhawan.mcp.gymsharkhomework.data.product.ProductRepository
import com.wadhawan.mcp.gymsharkhomework.models.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.util.concurrent.TimeUnit
import javax.inject.Inject

// CDNProductRepository class implementing ProductRepository interface
class CDNRepository @Inject constructor() : ProductRepository {

    // OkHttpClient instance with custom timeouts
    private val client = OkHttpClient()
        .newBuilder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()

    // Function to fetch products from CDN
    override suspend fun fetchProducts(context: Context): Map<String, Product> {
        // Fetch JSON data from CDN URL
        val json = fetchJsonData() ?: "{}"
        // Parse JSON data to get hits
        val element = JsonParser.parseString(json)
        val hitsJson = element.asJsonObject.get("hits").toString()

        // Parse hits JSON to get product list
        return parseProductList(hitsJson)
    }

    // Function to fetch JSON data from CDN URL
    private suspend fun fetchJsonData(): String? = withContext(Dispatchers.IO) {
        try {
            // Build HTTP request
            val request = Request.Builder()
                .url(CDN_URL)
                .build()

            // Execute HTTP request
            client.newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    // Return response body as string if successful
                    response.body?.string()
                } else {
                    // Log error message if HTTP response is not successful
                    debug(message = "HTTP error response: ${response.code}")
                    null
                }
            }
        } catch (e: Exception) {
            // Log error message if exception occurs during HTTP request
            debug(message = "Error fetching data ${e.message}")
            null
        }
    }
}
