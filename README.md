Gymshark Project Overview
Project Decisions
Structure
MVVM Architecture: Utilized MVVM to separate UI, data presentation, and business logic, enhancing code maintainability and readability.
Data Folder: Contains essential files like Log, Product, Deserializer, GsonService, InfoLoader, RepositoryModule, etc., organized for better project organization.
Services Target: Moved services into their own target to keep the main application clean and focused.
Jetpack Compose: Leveraged Jetpack Compose for faster UI development, enabling rapid prototyping and iteration.
Dependency Injection: Implemented Dependency Injection for improved maintainability and testability, enhancing code quality and modularity.
With More Time
Products Search:
Implemented a search bar for easy filtering of items by text.
Added additional filters such as Type (Leggings, Bra, etc.) and Price Range for enhanced user experience.
Products Details:
Incorporated suggestion items in the same category at the bottom of the page, similar to the website, to improve user engagement.
Implemented functional wishlist and basket features for seamless shopping experience.
Development:
Enhanced UI with dedicated wishlist and basket views, streamlining user interaction.
Expanded test coverage with Snapshot and UITests to ensure robustness and reliability.
Integrated a local database to store user details, refreshing only when necessary, for optimized performance.
Prioritized accessibility considerations to ensure inclusivity and ease of use for all users.
Requirements
Pages
Search List:
Displays items with detailed information including item title, price, color, etc.
Handles incorrect or missing images gracefully.
Products contain labels indicating different states using Enums.
Property Details:
Provides comprehensive information retrieved from the items.
Properly handles HTML text in the description for seamless presentation.
API/Responses
Products List: View JSON
