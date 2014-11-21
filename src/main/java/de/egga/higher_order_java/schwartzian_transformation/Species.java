package de.egga.higher_order_java.schwartzian_transformation;

/**
 * @author egga
 */
public class Species {

    private final String name;

    public Species(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Species species = (Species) o;

        if (name != null ? !name.equals(species.name) : species.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
