package danil.chapter7;

class Engine{

    void start(){
        System.out.println("Start engine");
    }

    void rev(){
        System.out.println("Rev engine");
    }

    void stop(){
        System.out.println("Stop engine");
    }

    void service(){
        System.out.println("Service engine");
    }
}

class Wheel{

    void inflate(int psi){
        System.out.println("Inflate wheel on " + psi + "%");
    }
}

class Window{

    void rollup(){
        System.out.println("Rollup windows");
    }

    void rolldown(){
        System.out.println("Rolldown windows");
    }
}

class Door{

    Window window = new Window();

    void open(){
        System.out.println("door open");
    }

    void close(){
        System.out.println("door close");
    }
}

public class Car {

    Engine engine = new Engine();

    Wheel[] wheels = new Wheel[4];

    Door left = new Door(), right = new Door();

    Car(){
        for(int i = 0; i < 4; i++)
            wheels[i] = new Wheel();
    }
}
