🖥️ MyGreetingApp<br><br>
📅 Date: 3rd March 2025<br><br>
🚀 Overview<br>
This assignment focuses on learning and building Java-based web applications using Spring Boot. You are expected to complete the following tasks from the live class:<br><br>
🎯 Objective<br>
In this learning module, you'll gain a fundamental understanding of how modern web applications are built using Spring Boot. The initial exercise will involve creating a basic Spring Boot application, giving you a solid foundation for more complex systems. You will then explore how to build and deploy web applications using Spring Boot's built-in server.<br><br>

🔑 Key Learning Points:<br>
🚀 Extend the GreetingController<br>
GreetingController:<br>
Return JSON for different HTTP methods.<br>
Test the application using curl to check different HTTP methods.<br>
Service Layer Integration:<br><br>

Extend the GreetingController to use a service layer for getting a simple greeting message.<br>
The greeting message will default to "Hello World."<br>
Custom Greeting Messages:<br><br>

Allow the Greeting App to return a personalized greeting message with:<br>
User's first name and last name.<br>
Either first name or last name based on the provided user attributes.<br>
If neither is provided, return a default greeting, “Hello World.”<br>
Repository Integration:<br><br>

Save Greeting Messages: The Greeting App will be able to save greeting messages in the repository.<br><br>
Find Greeting by ID: Retrieve a greeting message from the repository by its ID.<br><br>
List All Greetings: Display all the greeting messages stored in the repository.<br><br>
Edit Greeting Messages: The Greeting App will allow editing of existing greeting messages in the repository.<br><br>
Delete Greeting Messages: The Greeting App will be able to delete greeting messages from the repository.<br><br>
🛠️ Running the Application<br><br><br>

-----<br>

🚨 User Authentication Module<br>
Create an API where users can register and log in using their email and password. The system will store user details in the database, validate input fields, and return appropriate responses. Additionally, implement a token-based approach for authentication.<br><br>

📝 Objective:<br>
Create an API that allows users to register with their details while ensuring proper validation.<br><br>

🔑 User Authentication Features:<br>
User Registration:<br><br>

Validate user input fields such as first name, last name, email, and password.<br>
Ensure the email is unique before registering.<br>
Encrypt user passwords for security.<br>
User Login:<br>

Validate user credentials using the stored encrypted password.<br>
Return a JWT token for valid logins.<br>
Token-Based Authentication:<br>

Implement a JWT token mechanism for secure user authentication after login.<br>
🚀 Technology Stack:<br><br>
Spring Boot for backend development<br>
Spring Security for authentication<br>
Spring Data JPA for database interaction<br>
JWT for token-based authentication<br>
H2 Database (or any other preferred database for development<br><br>


-----<br>
