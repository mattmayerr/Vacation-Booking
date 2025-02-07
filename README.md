# 🏝️ Travel Agency Backend Modernization
## 📌 Project Overview
The Travel Agency Backend Modernization project aims to migrate a legacy back-end system (built in the early 1990s) to a modern, maintainable, and scalable Spring Framework solution. The previous system has accumulated significant technical debt, making it difficult for the front-end engineers (who recently overhauled the vacation booking platform using Angular and JavaScript) to efficiently communicate with the back-end due to undocumented bugs, lack of support, and outdated technologies.

This initiative will focus on developing a minimally viable product (MVP) that replicates and enhances mission-critical functionalities, ensuring smooth integration with the newly developed front-end.

## 🎯 Goals & Objectives
✅ Port Essential Features – Identify and migrate core booking functionalities to Spring Boot.<br>
✅ Improve Stability & Maintainability – Reduce tech debt, enhance documentation, and introduce best practices.<br>
✅ Ensure Compatibility – Provide a modern API that seamlessly integrates with the Angular front-end.<br>
✅ Enhance Security – Implement authentication, authorization, and secure communication.<br>
✅ Improve Performance – Optimize response times and reduce latency using efficient data structures and caching strategies.

## 🏗️ Tech Stack
- Java 17+
- Spring Boot 3+
- Spring MVC
- Spring Security	
- Spring Data JPA	
- Hibernate	ORM for database operations
- MySQLWorkbench/MySQL	
- Lombok	
- Angular(15.2.11+) Front End 
## 🔧 Setup & Installation
### Prerequisites
Ensure you have the following installed:

- JDK 17+
- Maven 3+
- MySQL Workbench

Clone the repository then follow the next set of instructions below<br>

1. Run the create_and_populate_db.sql script in your mySQL Workbench. This file is located in LabFiles/create_and_populate_db.sql
2. Run the backend in your IDE, preferrably IntelliJ
3. To start the frontend, open PowerShell and run this command in a seperate powershell window, with the backend already running: ```cd FrontEnd; ng serve```<br>
4. Leave the powershell window open. You'll know it's running when you see `√ Compiled successfully.` in the output.
5. open http://localhost:4200/
6. If you need to stop the frontend, press `CTRL + C` repeatedly in the PowerShell window.




## 🛠️ Development & Contribution
### Code Style & Guidelines
- Follow Google Java Style Guide
- Use meaningful commit messages: [Feature], [Bugfix], [Refactor]
- Write unit tests for all features before merging
### Branching Strategy
#### 📂 Main Branches:

- ```main``` – Stable production-ready code
- ```develop``` – Active development branch

#### 📂 Feature Branches:
- ```feature/{feature-name}``` – For new features
- ```bugfix/{bug-description}``` – For fixing bugs
### Submitting a PR
1. Fork the repository
2. Create a new feature branch
3. Implement changes & test
4. Open a pull request (PR) to develop

## 🐞 Known Issues & Limitations
- Some legacy business logic is still being mapped from the old system
- Initial API responses may be slow until caching strategies are fully implemented
- Authentication & authorization are in the early stages

## 📜 License
This project is licensed under the MIT License – see the LICENSE file for details.

## 👥 Contributors
- Matthew Mayer – Lead Developer<br>
- Contributions are welcome! Feel free to open an issue or submit a pull request.