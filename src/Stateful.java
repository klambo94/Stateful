/**
 * A mutable object that maintains state. Three components of state include textual, numerical,
 * and logical data.
 * Version:
 * v2.4.3
 * Author:
 *  API: Dr. Jody Paul
 *  Implementation: Kendra Lamb
 */
public class Stateful {
    /**
     * Constructs a stateful object using arbitrary values.
     */
    public Stateful() {

    }

    /**
     * Constructs a stateful object using specified values.
     * @param text - the textual data
     * @param number - the numerical data
     * @param truth - the logical data
     */
    public Stateful(String text, Number number, Boolean truth) {

    }

    /**
     * Accesses the logic component of state.
     * @return the truth status
     */
    public Boolean truth() {

        return null;
    }

    /**
     * Accesses the numeric component of state.
     * @return the numerical status
     */
    public Number number() {
        return null;
    }

    /**
     * Accesses the text component of state
     * @return the textual status
     */
    public String text() {
        return null;
    }

    /**
     * Modifies the state by inverting the logical value. If the state value was true,
     * it is changed to false. If the state value was false, it is changed to true.
     */
    public void flip() {

    }

    /**
     * Renders object in the format: Stateful[truth, number, "text"]
     * @return A String representation of the Stateful Object
     */
    @Override
    public String toString() {
        return null;
    }

}
