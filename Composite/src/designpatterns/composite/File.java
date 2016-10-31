package designpatterns.composite;

public class File extends Component {

    public File(String name) {
        super(name);
    }

    public void open() {
        System.out.println("I'm a File and I'm open.");
    }

    public void close() {
        System.out.println("I'm a Folder and I'm now closed.");
    }

    public void rename(String name) {
        this.setName(name);
    }
}
