using ApiTracking.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ApiTracking.Repository
{
    public interface IUsuarioRepository
    {
        void add(Usuario usuario);

        IEnumerable<Usuario> GetAll();

        Usuario Find(long id);

        void Remover(long id);

        void Update(Usuario user);
    }
}
