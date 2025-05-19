package Pertemuan11;

public abstract class T_AlatPemantau {
	protected String lokasi;

	public T_AlatPemantau(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public abstract void tampilkanInfo();
}
