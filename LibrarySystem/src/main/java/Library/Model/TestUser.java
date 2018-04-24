package Library.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by rajalakshmi on 23/4/18.
 */
@Entity
@Table(name = "Test_User")
public class TestUser {

    @Column(name = "id")
    long id;

    @Column(name = "Name")
    String name;

    @Column(name = "Mobile_number")
    long number;

    @Column(name = "email_id")
    String mailId;


    public TestUser(String name, long number, String mailId) {
        this.name = name;
        this.number = number;
        this.mailId = mailId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    public String getMailId() {
        return mailId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
}
