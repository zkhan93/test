interface Engine{
    public void start(boolean keyIn);
}

class TVSEngine implements Engine{
    int count = 0;
    public void start(boolean keyIn){
        // so something
        count++;
        stop(keyIn);
    }

    public void stop(boolean keyI){
        count--;
    }
}

class ABCEngine implements Engine{
    int count = 0;
    public void start(boolean keyI){
        // so something
        count++;
    }
}
class Test{
    public void test(Engine e){
        e.start(true); // 
        e.start(false); // 
        // e.stop();
    }

    public static void main(String[] args){
        System.out.println("Hello!");
        new Test().test(new TVSEngine());
    }
}
