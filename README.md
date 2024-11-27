
# Project Title

This project demonstrates the integration of Firebase Cloud Messaging (FCM) with a Spring Boot application for sending notifications. Notifications can be sent to specific devices or to devices subscribed to a topic.


## Features

- Send notifications to a specific device using its token.
- Send notifications to devices subscribed to a topic.
- Configurable Firebase credentials via `application.yml`.


## Prerequisites

- Java 17 or later (Previous version might work, but I don't know for sure)
- Firebase account(You can create it for free)
- Firebase project with FCM enabled
- Firebase service account key JSON file


## Configuration

Add the following configuration in `application.yml`:

You can configure Firebase credentials using two methods: **via `application.yml`** or **via environment variables**.

### Option 1: Configure via `application.yml`

Add the following configuration in `application.yml`:

```yaml
spring:
  application:
    name: firebaseFCM

fcm:
    path: ${FILE_PATH} # Replace ${FILE_PATH} with the path to your Firebase service account JSON file
```

### Option 2: Configure via Environment Variable
You  can configure the environment variables from you intellij consoles also, Below are the steps:
```
1. Go to edit configuration
2. Click more options there & select Environment variables
3. Add necessary env variables there like shown in screenshot 3 & click ok.
```
### Screenshot for second option

<p style="font-size: 14px;">This is the first screenshot showing the steps for setting the environment variable:</p>
<img src="https://github.com/AmritkThapa/Sample-firebaseFCM-project/blob/master/screenshots/Screenshot_1.png" width="300"/>

<p style="font-size: 14px;">This is the second screenshot showing the next step:</p>
<img src="https://github.com/AmritkThapa/Sample-firebaseFCM-project/blob/master/screenshots/Screenshot_2.png" width="300"/>

<p style="font-size: 14px;">This is the third screenshot showing the final step:</p>
<img src="https://github.com/AmritkThapa/Sample-firebaseFCM-project/blob/master/screenshots/Screenshot_2.png" width="300"/>
