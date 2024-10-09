public class Cube {
    private int length;
    private int volume; 

    public Cube (int edgeLength) {
        this.length = edgeLength;
        this.volume = edgeLength*edgeLength*edgeLength;
    }

    public int volume() {    
        return this.volume;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + this.length + " and the volume " + this.volume;
    }
}
