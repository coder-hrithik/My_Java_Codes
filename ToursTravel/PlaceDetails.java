package ToursTravel;

public class PlaceDetails {
    String p_name;
    String p_city;
    String p_culture;
    String p_month;
    double p_price;

    PlaceDetails(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        this.p_name = p_name;
        this.p_city = p_city;
        this.p_culture = p_culture;
        this.p_month = p_month;
        this.p_price = p_price;
    }
}

class Manali extends PlaceDetails {
    Manali(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class sv extends Manali {
    sv(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class om extends Manali {
    om(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class jw extends Manali {
    jw(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class rp extends Manali {
    rp(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class Leh_Ladhak extends PlaceDetails {
    Leh_Ladhak(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class pl extends Leh_Ladhak {
    pl(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class kl extends Leh_Ladhak {
    kl(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class sg extends Leh_Ladhak {
    sg(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class nv extends Leh_Ladhak {
    nv(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class Coorg extends PlaceDetails {
    Coorg(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class af extends Coorg {
    af(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class rs extends Coorg {
    rs(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class gt extends Coorg {
    gt(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}

class tp extends Coorg {
    tp(String p_name, String p_city, String p_culture, String p_month, double p_price) {
        super(p_name, p_city, p_culture, p_month, p_price);
    }
}
