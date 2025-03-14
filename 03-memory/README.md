# Java and AI - Episode 3: Memory
This repository contains supporting code for the Youtube Episode "Java and AI - Episode 3: Memory".

Episode Link: [Java and AI - Episode 3: Memory](https://youtu.be/HjjGzprkCKo)


## About the Episode
This episode explores how to keep memory of subsequent calls to an LLM; and how to have parallel conversations without cross-interference. The sample code shows how to create a Quarkus CLI application that you can run from your command line. 

## Running the Code
To run the code, follow these steps:
1. Clone this repository using Git:
   ```bash
   git clone https://github.com/kdubois/quarkus-langchain4j-course.git
   cd quarkus-langchain4j-course/03-memory
   ```
   
   1. If you want to run in Quarkus Dev mode, start it up with:
    ```bash
       mvn quarkus:dev [command]
   ```
   where command is either `hello` or `parallel` depending on which command from the `EntryCommand` file you want to run.
