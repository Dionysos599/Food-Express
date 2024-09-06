# Food-Express
Online order system containing features like registration, login, menu searching, ordering, and checkout.

## Deployed URL
https://5qsts38p4t.us-east-2.awsapprunner.com

## Configuration
1. Navigate to `backend` directory
2. Run build.gradle for configuration
3. We are using Docker for the Database in this project, so you need to have it downloaded.
4. In the terminal, run the following commands:
```
cd Server
docker-compose up -d
cd ../FoodExpress
npm install
```
5. In the terminal run `npm start` to run the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.
7. For other scripts, view [frontend/package.json](https://github.com/Dionysos599/Food-Express/blob/frontend/package.json).

<br>
<br>

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).
