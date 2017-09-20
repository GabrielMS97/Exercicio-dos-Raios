package br.ufjf.dcc171;

class Raio {
    private float latitude;
    private float longitude;
    private String dataHora;
    private String descricao;

    public Raio(float latitude, float longitude, String dataHora, String descricao) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
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
