
# WhatsApp Chatbot Backend Simulation

## Overview
This project is a simple WhatsApp chatbot backend simulation built using Java and Spring Boot.

## Features
- REST API endpoint `/webhook`
- Accepts JSON input simulating WhatsApp messages
- Returns predefined responses
- Logs incoming messages

## Tech Stack
- Java
- Spring Boot

## API Endpoint

### POST /webhook

Request:
```json
{
  "msg": "hi"
}
````

Response:

```json
{
  "reply": "Hello, I'm ChatBot"
}
```

## How to Run

1. Clone repo
2. Run:

```
mvn spring-boot:run
```

3. Test using Postman at:

```
http://localhost:8080/webhook
```

## Sample Responses

* hi → Hello
* bye → Goodbye
* others → I don't understand

```

---

# ✅ 4. Screenshots (REQUIRED)

Take 4 screenshots:

1. Code (controller + service)
2. Postman request (JSON body visible)
3. Response output
4. Console logs

👉 Don’t skip this. Many do.

---

# ✅ 5. Demo Video (2–3 mins)

Use this script (just follow it):

### 🎥 What to say:

1. Intro (20 sec)
> “Hi, I built a WhatsApp chatbot backend simulation using Spring Boot.”

2. Show code (30 sec)
> “This is the webhook controller and service logic.”

3. Run API (1 min)
- Send request in Postman
- Show response
- Show console log

4. End (10 sec)
> “This fulfills all assignment requirements.”

---

# 🚀 6. BONUS (only if time, 15–20 min)

Deploy on **:contentReference[oaicite:0]{index=0}**

### Steps:
1. Push GitHub (done)
2. Go Render → New Web Service
3. Connect repo
4. Build:
```

./mvnw clean install

```
5. Start:
```

java -jar target/*.jar

```

👉 Then your API becomes:
```

[https://your-app.onrender.com/webhook](https://your-app.onrender.com/webhook)

```