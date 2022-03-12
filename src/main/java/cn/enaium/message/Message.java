package cn.enaium.message;

import java.io.Serializable;

/**
 * @author Enaium
 */
public class Message implements Serializable {
    private final String data;

    public Message(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "data='" + data + '\'' +
                '}';
    }
}
