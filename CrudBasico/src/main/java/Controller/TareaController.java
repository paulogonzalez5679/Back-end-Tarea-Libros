/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Tarea;
import Service.TareaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yonder
 */
@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class TareaController {
    @Autowired
    private TareaService tareaService;
    
    //listar
    @GetMapping("/tareas")
    public List<Tarea> listar()
    {
        return tareaService.findAll();
    }
    
    //guardar
    @PostMapping("/tareas")
    public  Tarea guardar(@RequestBody Tarea tarea)
    {
        return tareaService.save(tarea);
    }
    
    //get una tarea
    @GetMapping("/tareas/{id}")
    public Tarea getUnaTarea(@PathVariable String id)
    {
        return tareaService.findById(id);
    }
    
    //Modeficar
    @PutMapping("/tareas/{id}")
    public Tarea modifecar(@RequestBody Tarea tarea,@PathVariable String id)
    {
        Tarea tareaActual= tareaService.findById(id);
        tareaActual.setNombre(tarea.getNombre());
        tareaActual.setDescripcion(tarea.getDescripcion());
        tareaActual.setAutor(tarea.getAutor());
        tareaActual.setEjemplares(tarea.getEjemplares());
        tareaActual.setCosto(tarea.getCosto());
        return tareaService.save(tareaActual);
    }
    
    @DeleteMapping("/tareas/{id}")
    public void eliminar(@PathVariable String id)
    {
        tareaService.delete(id);
    }
    
}
