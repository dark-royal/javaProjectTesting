package reflection;

public enum GeoPoliticalZones {

    NORTHWEST("Kebbi","Sokoto","Kastina","Zamfara","Kaduna","Kano"),
    NORTHEAST("Adamawa", "Yobe","Borno","Bauchi","Gombe","Taraba","Jigawa"),

    NORTHCENTRAL("Plateau","Kwara","Kogi","Benue","Niger","Nasarawa","FCT"),

    SOUTHWEST("Lagos","Ondo","Osun","Oyo","Ogun","Ekiti"),

    SOUTHEAST("Abia","Anambra","Ebonyi","Enugu","Imo"),

    SOUTHSOUTH("Bayelsa","Edo","Cross_River","Delta","Akwa_Ibom");


    private final String[] state;


    GeoPoliticalZones(String...state) {
        this.state = state;
    }

    public String[] getState(){
        return state;
    }
}
