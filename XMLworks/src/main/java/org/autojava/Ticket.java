package org.autojava;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.MarshalException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

@XmlRootElement(name = "ticket")
public class Ticket implements JAXBmarshal{
    private Integer num;
    private String name;
    private GregorianCalendar dat;
    private BigDecimal cost;

    @XmlAttribute
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public GregorianCalendar getDat() {
        return dat;
    }

    public void setDat(GregorianCalendar dat) {
        this.dat = dat;
    }

    @XmlElement
    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public static String doJAXBmarshal(Object o){
        StringWriter sw = new StringWriter();
        String s = "";
        try {
            JAXBContext contextObj = JAXBContext.newInstance(Ticket.class);
            Marshaller marshallerObj = contextObj.createMarshaller();
            marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallerObj.marshal(o, System.out);
            marshallerObj.marshal(o, sw);
        } catch ( MarshalException e) {
            System.out.println("Error marshalException" + e);
        } catch ( JAXBException jb) {
            jb.printStackTrace();
        }
        s = sw.toString();
        return s;
    }

}
