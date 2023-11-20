package pasquaCorrezioneVerifica;

public class Prenotazione {
    public Persona persona;
    public String data;
    public String ora;

    public Prenotazione(){

    }

    public Prenotazione(Persona p, String d, String o)throws Exception{
        setPersona(p);
        setData(d);
        setOra(o);
    }

    public void setPersona(Persona persona) throws Exception {
        if(persona != null){
            Persona temp = new Persona(persona);

            this.persona = temp;
        } else
            throw new Exception("L'attributo data non può essere null!");
    }


    public void setData(String data)throws Exception {
        String giornoString, meseString, annoString ;
        Integer giorno, mese, anno;

        Boolean valida = false;

        try {
            giornoString = data.substring(0, 2);
            meseString   = data.substring(3, 5);
            annoString   = data.substring(6, 10);

            giorno = Integer.parseInt(giornoString);
            mese   = Integer.parseInt(meseString);
            anno   = Integer.parseInt(annoString);

            if (anno >= 1000 && anno <= 9999) {
                switch (mese) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (giorno >= 1 && giorno <= 31)
                            valida = true;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (giorno >= 1 && giorno <= 30)
                            valida = true;
                        break;
                    case 2:
                        if (anno % 400 == 0 || (anno % 4 == 0 && anno % 100 != 0)) {
                            if(giorno >= 1 && giorno <= 29)
                                valida = true;
                        } else
                        if(giorno >= 1 && giorno <= 28)
                            valida = true;
                }
            }

            if (valida)
                this.data = data;
            else
                throw new Exception("Data errata!");

        } catch (StringIndexOutOfBoundsException | NumberFormatException e) {
            throw new Exception("La data non rispetta il formato GG/MM/AAAA!");
        } catch (NullPointerException e) {
            throw new NullPointerException("L'attributo data non può essere null!");
        }
    }

    public void setOra(String ora) throws Exception{
        String oreString, minutiString, secondiString ;
        Integer ore, minuti, secondi;

        Boolean valida = false;

        try{
            oreString     = ora.substring(0, 2);
            minutiString  = ora.substring(3, 5);
            secondiString = ora.substring(6, 8);

            ore     = Integer.parseInt(oreString);
            minuti  = Integer.parseInt(minutiString);
            secondi = Integer.parseInt(secondiString);

            if(ore>=0 && ore <=23)
                if(minuti>=0 && minuti<=59)
                    if(secondi>=0 && secondi<=59)
                        valida=true;

            if (valida)
                this.ora = ora;
            else
                throw new Exception("Ora errata!");

        } catch (StringIndexOutOfBoundsException | NumberFormatException e) {
            throw new Exception("L'ora non rispetta il formato OO:MM:SS!");
        } catch (NullPointerException e) {
            throw new NullPointerException("L'attributo ora non può essere null!");
        }
    }


    public String getData() {
        return data;
    }

    public String getOra() {
        return ora;
    }

    public Persona getPersona() throws Exception{
        Persona temp = new Persona(persona);

        return temp;
    }

    @Override
    public String toString() {
        return "[" + persona + ", " + data + ", " + ora + ']';
    }
}
