
package Fasti.ical4jext;

import net.fortuna.ical4j.model.Escapable;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;

public class Calname extends Property implements Escapable {

    public static final String CALNAME = "X-CALNAME";
    private static final long serialVersionUID = 8651881536125682421L;

    private String value;

    /**
     * Default constructor.
     */
    public Calname() {
        super(CALNAME, PropertyFactoryImpl.getInstance());

    }

    /**
     * @param aValue a value string for this component
     */
    public Calname(final String aValue) {
        super(CALNAME, PropertyFactoryImpl.getInstance());
        setValue(aValue);
    }

    /**
     * @param aList a list of parameters for this component
     * @param aValue a value string for this component
     */
    public Calname(final ParameterList aList, final String aValue) {
        super(CALNAME, aList, PropertyFactoryImpl.getInstance());
        setValue(aValue);
    }

    /**
     * {@inheritDoc}
     */
    public final void validate() throws ValidationException {

        /* Wir brauchen keine Validatoren, da die Eigenschaft nur intern genutzt
           wird */
    }

    /**
     * {@inheritDoc}
     */
    public final void setValue(final String aValue) {
        this.value = aValue;
    }

    /**
     * {@inheritDoc}
     */
    public final String getValue() {
        return value;
    }
}