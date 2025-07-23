package MultiThreading;

//executing multi threads at a same time

// 🔹 What is a Thread?
// A thread is a lightweight unit of a process.


//A process is collection of threads
//we can run multiple process concurentlu
// A process is an independent program (like MS Word, Chrome, etc.).

// A thread is a smaller part of a proces
//that can run independently but shares memory with other threads in the same process.

// 🧠 Think of a process as a kitchen, and threads as chefs working in the same kitchen.

// 🔹 Why Use Threads?
// To do multiple things at the same time (concurrently).
// Example: In a download manager, one thread downloads the file, while another thread updates the progress bar.


//interthread communication
// When multiple threads are working together and need to coordinate,
//they use inter-thread communication.

//🧠 Example: A Producer thread is adding items to a queue,
//and a Consumer thread is removing items. They need to wait and notify each other.

//In multi threading, only 10% work will be done by programmer and 90% work will be done by JAVA API

//how many ways?
//By extending Thread Class
//by Implementin Runnabla

public class MultiThreading {
    public static void main(String[] args) {
        
    }
}
