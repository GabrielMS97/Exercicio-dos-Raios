package br.ufjf.dcc171;

class Detalhes {
    private float lat;
    private float lon;
    private String dataHora;
    private String descricao;

    public Detalhes(float lat, float lon, String dataHora, String descricao) {
        this.lat = lat;
        this.lon = lon;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }
    

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
