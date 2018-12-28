using Microsoft.EntityFrameworkCore;

namespace ApiTracking.Models
{
    public class PhoneLocationDbContext : DbContext
    {
        public PhoneLocationDbContext(DbContextOptions<PhoneLocationDbContext> options) : base(options)
        {

        }

        public DbSet<PhoneLocation> PhoneLocation { get; set; }
    }
}
