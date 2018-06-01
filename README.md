READ ME.

Run the following:

From the directory that contains the POM file:

mvn clean package docker:build

Then run:

docker run --name trainer-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=trainer -e MYSQL_USER=trainer_user -e MYSQL_PASSWORD=trainer_pass -d mysql:5.6

docker logs trainer-mysql (ensure mysql server is up)

docker run -p 8080:8080 --name trainer-app --link trainer-mysql:mysql -d trainer/trainer-tracker

docker logs trainer-app (ensure app is up by accessing http://localhost:8080)
