package main.java.com.alura.desafio.LiterAlura.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutor;

    @Column(unique = true)
    private String nombreAutor;
    private Integer añoDeNacimiento;
    private Integer añoDeFallecimiento;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Libro> libros;

    public Autor(DatosAutor datosAutor){
        this.nombreAutor = datosAutor.nombreAutor();
        this.añoDeNacimiento = datosAutor.fechaDeNacimiento();
        this.añoDeFallecimiento = datosAutor.fechaDeFallecimiento();
    }

    public Autor(){

    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public Integer getAnioDeNacimiento() {
        return añoDeNacimiento;
    }

    public void setAnioDeNacimiento(Integer añoDeNacimiento) {
        this.añoDeNacimiento = añoDeNacimiento;
    }

    public Integer getAnioDeFallecimiento() {
        return añoDeFallecimiento;
    }

    public void setAnioDeFallecimiento(Integer añoDeFallecimiento) {
        this.añoDeFallecimiento = añoDeFallecimiento;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        libros.forEach(l -> l.setAutor(this));
        this.libros = libros;
    }
}
