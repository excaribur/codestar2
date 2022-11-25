class Helper {
   int find( Player p ) {
       if (p == null) return (0);
       return (find(p.right) + find(p.left) + p.number);
   }
}
