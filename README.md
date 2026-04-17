# Task Manager Web (Java Servlet)

## Description

A simple Task Management Web Application built with Java Servlet, HTML, and CSS.
This project demonstrates basic CRUD operations and client-server interaction.

---

## Features

* Add new task
* View all tasks
* Update task (optional)
* Delete task (optional)

---

## Tech Stack

* Java (Servlet API)
* HTML / CSS
* Apache Tomcat (Web Server)

---

## Project Structure

```
task-web/
│── src/
│   └── task/
│        └── TaskServlet.java
│
│── webapp/
│   ├── index.html
│   ├── style.css
│
│── WEB-INF/
│   └── web.xml
```


## Setup & Run

### 1. Clone project

```
git clone https://github.com/your-username/task-web.git
```

### 2. Install Apache Tomcat

Download from:
https://tomcat.apache.org/


### 3. Deploy project

Copy project into:

```
apache-tomcat/webapps/
```


### 4. Start server

Windows:

```
startup.bat
```

Mac/Linux:

```
./startup.sh
```


### 5. Open browser

```
http://localhost:8080/task-web/
```


## How it works

```
Browser → HTTP Request → Tomcat → Servlet → Response HTML
```


## Notes

* Tasks are stored in memory and will be lost after restart
* This project is intended for learning and demonstration purposes


## Future Improvements

* Save data to file or database
* Add update/delete buttons on UI
* Improve UI design
* Add authentication system


## Author

* TUAN ANH
