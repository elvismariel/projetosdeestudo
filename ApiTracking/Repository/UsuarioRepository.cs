using System;
using System.Collections.Generic;
using System.Linq;
using ApiTracking.Models;

namespace ApiTracking.Repository
{
    public class UsuarioRepository : IUsuarioRepository
    {
        private readonly UsuarioDbContext ctx;

        public UsuarioRepository(UsuarioDbContext context)
        {
            ctx = context;
        }

        public void add(Usuario usuario)
        {
            ctx.Usuario.Add(usuario);
            ctx.SaveChanges();
        }

        public Usuario Find(long id)
        {
            return ctx.Usuario.FirstOrDefault(u => u.Id == id);
        }

        public IEnumerable<Usuario> GetAll()
        {
            return ctx.Usuario.ToList();
        }

        public void Remover(long id)
        {
            var entity = ctx.Usuario.First(u => u.Id == id);
            ctx.Usuario.Remove(entity);
            ctx.SaveChanges();
        }

        public void Update(Usuario user)
        {
            ctx.Usuario.Update(user);
            ctx.SaveChanges();
        }
    }
}
