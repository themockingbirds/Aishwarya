class Class0 {
        public static void main(String[] args) {
            System.out.println("Know your current thread: "+Thread.currentThread());
            System.out.println("Name of your current thread: "+Thread.currentThread().getName());
            Thread.currentThread().setName("HelloWorld");
            System.out.println("Name of your current thread: "+Thread.currentThread().getName());
            System.out.println("Is current thread alive: "+Thread.currentThread().isAlive());
            System.out.println("Total Active Thread: "+Thread.activeCount());
        }
    }