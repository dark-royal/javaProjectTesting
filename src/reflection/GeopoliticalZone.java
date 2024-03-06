package reflection;

public class GeopoliticalZone {

    public GeopoliticalZone1 showState(String states) throws StateNotFoundException {
        for(GeopoliticalZone1 geopoliticalZone: GeopoliticalZone1.values()){
            GeopoliticalZone1 geopoliticalZone1 = findGeopoliticalZone(states,geopoliticalZone);
                if(geopoliticalZone1 != null) return geopoliticalZone;

        }
        return null;
    }

    private GeopoliticalZone1 findGeopoliticalZone(String states, GeopoliticalZone1 geopoliticalZone) throws StateNotFoundException {
        String[] zone = geopoliticalZone.getState();
        for(String state : zone){
            if(state.equalsIgnoreCase(states)) return geopoliticalZone;
        }
        return null;
    }


}
