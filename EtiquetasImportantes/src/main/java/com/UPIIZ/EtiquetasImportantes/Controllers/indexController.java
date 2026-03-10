package com.UPIIZ.EtiquetasImportantes.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class indexController {
    @GetMapping("/index")
    public String mostrarIndex(){return "index";}

    @GetMapping("/Formulario")
    public String mostrarFormulario(){return "Formulario";}

    @GetMapping("/Imagenes")
    public String mostrarImagenes(){return "Imagenes";}

    @GetMapping("/Listas")
    public String mostrarListas(){return "Listas";}

    @GetMapping("/Multimedia")
    public String mostrarMultimedia(){return "Multimedia";}

    @GetMapping("/Semanticas")
    public String mostrarSemanticas(){return "Semanticas";}

    @GetMapping("/Tables")
    public String mostarTables(){return "Tables";}

    @GetMapping("/Texto")
    public String mostarTexto(){return "Texto";}
}


