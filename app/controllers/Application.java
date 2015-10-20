package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result home() {
        return ok(home.render());
    }
    
    public Result criar_projeto() {
        return ok(criar_projeto.render());
    }
    
    public Result index() {
        return ok(index.render("Esta funcionando!"));
        // "Your new application is ready."
    }
    
    public Result info_ong() {
        return ok(info_ong.render());
    }
    
    public Result info_usuario() {
        return ok(info_usuario.render());
    }
    
    public Result login() {
        return ok(login.render());
    }
    
    public Result cadastro() {
        return ok(cadastro.render());
    }
    
    public Result pagamento() {
        return ok(pagamento.render());
    }
    
    public Result perfil_ong() {
        return ok(perfil_ong.render());
    }
    
    public Result menu_logado() {
        return ok(menu_logado.render());
    }
    
    public Result perfil_usuario() {
        return ok(perfil_usuario.render());
    }
    
    public Result projeto() {
        return ok(projeto.render());
    }
    
    public Result info_projeto() {
        return ok(info_projeto.render());
    }

}
