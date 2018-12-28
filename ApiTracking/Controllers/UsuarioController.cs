using ApiTracking.Models;
using ApiTracking.Repository;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;

namespace ApiTracking.Controllers
{
    [Produces("application/json")]
    [Route("api/[Controller]")]
    public class UsuariosController : Controller
    {
        private readonly IUsuarioRepository usuarioRepository;

        public UsuariosController(IUsuarioRepository ur)
        {
            usuarioRepository = ur;
        }

        [HttpGet]
        public IEnumerable<Usuario> Get()
        {
            return usuarioRepository.GetAll();
        }

        [HttpGet("{id}", Name ="GetUsuario")]
        public IActionResult GetById(long id)
        {
            var usuario = usuarioRepository.Find(id);

            if (usuario == null)
                return NotFound(); // Erro 404

            return new ObjectResult(usuario);
        }
    }
}