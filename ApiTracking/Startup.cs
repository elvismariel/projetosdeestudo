using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ApiTracking.Repository;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using Microsoft.Extensions.Options;

namespace ApiTracking
{
    public class Startup
    {
        public Startup(IConfiguration configuration)
        {
            Configuration = configuration;
        }

        public IConfiguration Configuration { get; }

        // This method gets called by the runtime. Use this method to add services to the container.
        public void ConfigureServices(IServiceCollection services)
        {
            string conn = Configuration.GetConnectionString("DefaultConnection");

            // Mapeamento da conexão com o bando de dados
            services.AddDbContext<Models.UsuarioDbContext>(options => options.UseMySql(conn));
            services.AddDbContext<Models.PhoneLocationDbContext>(options => options.UseMySql(conn));

            // Mapeamento do Repositorio
            services.AddTransient<IUsuarioRepository, UsuarioRepository>();
            services.AddTransient<IPhoneLocationRepository, PhoneLocationRepository>();

            services.AddMvc();
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostingEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            app.UseMvc();
        }
    }
}
