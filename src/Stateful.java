/**
 * A mutable object that maintains state. Three components of state include textual, numerical,
 * and logical data.
 * @version  v2.4.2
 * @author API: Dr. Jody Paul Implmentation: Kendra Lamb
 */
public class Stateful {
    /** The text status of this object*/
    private String text;

    /** The numerical data of this object*/
    private Number number;

    /** The logical data of this object*/
    private Boolean truth;
    /**
     * Constructs a stateful object using arbitrary values.
     */
    public Stateful() {
        this("", -1, false);
    }

    /**
     * Constructs a stateful object using specified values.
     * @param text the textual data
     * @param number the numerical data
     * @param truth the logical data
     */
    public Stateful(String text, Number number, Boolean truth) {
        this.text = text;
        this.number = number;
        this.truth = truth;
    }

    /**
     * Accesses the logic component of state.
     * @return the truth status
     */
    public Boolean truth() {

        return this.truth;
    }

    /**
     * Accesses the numeric component of state.
     * @return the numerical status
     */
    public Number number() {
        return this.number;
    }

    /**
     * Accesses the text component of state
     * @return the textual status
     */
    public String text() {
        return this.text;
    }

    /**
     * Modifies the state by inverting the logical value. If the state value was true,
     * it is changed to false. If the state value was false, it is changed to true.
     */
    public void flip() {
        this.truth = !truth;
    }

    /**
     * Renders object in the format: Stateful[truth, number, "text"]
     * @return A String representation of the Stateful Object
     */
    @Override
    public String toString() {
        String numString = this.number.toString();
        String boolString = this.truth.toString();

        StringBuilder str = new StringBuilder("Stateful[");
        str.append(boolString)
           .append(", ")
           .append(numString)
           .append(", \"")
           .append(this.text)
           .append("\"]");

        return str.toString();

    }
}
