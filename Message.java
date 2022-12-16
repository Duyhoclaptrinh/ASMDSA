public class Message {
    String human;
    String data;
    

    public Message() {
        this.data = "";
    }
    
    public Message(String data) {
        this.data = data;
    }

    public Message(String human, String data) {
        this.human = human;
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHuman() {
        return this.human;
    }

    public void setHuman(String human) {
        this.human = human;
    }
//getter setter 
}
