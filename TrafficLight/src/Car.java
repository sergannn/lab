class Car extends Thread {
    private TrafficLight[] trafficLights;
    private int pos;

    public Car(String name, TrafficLight[] trafficLights) {
        super(name);
        this.trafficLights = trafficLights;
        pos = 0;                // start at first light
        start();
    }

    public int position() {
        return pos;
    }

    private void gotoNextLight() {
        // ToDo: Helper method to move car to next light
    }

    public void run() {
        while (true) {
            // ToDo: drive endlessly through all lights
        }
    }
}
