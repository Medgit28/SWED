FROM eclipse-temurin:17
WORKDIR /app
COPY src/ ./src
RUN javac src/*.java -d out

ENTRYPOINT ["java", "-cp", "out", "Main"]
CMD []
