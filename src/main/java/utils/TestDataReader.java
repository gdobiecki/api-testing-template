package utils;

import payloads.AddNewPostPayload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestDataReader {
    @XmlElement
    public AddNewPostPayload addNewPostPayload;

    public AddNewPostPayload getAddNewPostPayload() {
        return addNewPostPayload;
    }
}
