package repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import DAO.DBContext;
import java.util.ArrayList;
import model.model_CaSi;

public class repo_CaSi {
    private Connection conn;
    
    public repo_CaSi() {
        try {
            this.conn = DBContext.getConnection();
        } catch (Exception e) {
            e.printStackTrace(); // hiển thị ra lỗi
        }
    }
    
    public ArrayList<model_CaSi> findAll() {
        ArrayList<model_CaSi> listCS = new ArrayList<>();
        String sql = "SELECT * FROM CaSi";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                int id = rs.getInt("ID");
                String ten = rs.getString("TenCaSi");
                String queQuan = rs.getString("QueQuan");
                int tuoi = rs.getInt("Tuoi");
                int gioiTinh = rs.getInt("GioiTinh");
                
                model_CaSi cs = new model_CaSi(id, ten, queQuan, tuoi, gioiTinh);
                listCS.add(cs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCS;
    }
    
    public void create(model_CaSi cs) {
        //Kiểm tra xem db Ca si có ràng buộc với db nào ko, nếu ko thì chỉ cần 1 lần insert còn ngược lại 
        //thì phải insert vào db Ca si trước rồi insert vào db có ràng buộc sau
        // casi ko có ràng buộc nào nên chỉ cần 1 lệnh insert
        //Kiểm tra xem cột id có là tự tăng ko, nếu ko tự tăng thì phải sét cho nó tự tăng trong trường hợp này
        // ở đây là identiy đã thành yes nếu no thì thay nó bằng "YES" để tự động tăng
        // Tự tăng nên chúng ta ko insert ID vào 
        // Ở đây insert như là sử dụng query trong sql NÊN phải dùng đúng tên cột trong bảng (ở đây là bảng CaSi)
        // những cột khác ko chèn vào thì nó tự động là NULL
        String sql = "INSERT INTO CaSi (TenCaSi, QueQuan, Tuoi, GioiTinh) VALUES (?, ?, ?, ?)";
        //Sử dụng try catch để khi run không bị break chương trình vì nó liên quan đến dữ liệu rất quan trọng
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, cs.getTenString());
            ps.setString(2, cs.getQueQuanString());
            ps.setInt(3, cs.getTuoi());
            ps.setInt(4, cs.getGioiTinh());
            ps.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id) {
        //Vì id là khóa chính nên xóa theo khóa chính 
        // Kiểm tra nếu có ràng buộc thì mình phải xóa DB mà nó join đến CaSi trước để ko bị dính lỗi khóa ngoại :v
        // ở đây ko có liên kết nên cứ thoải mái xóa :v
        String sql = "DELETE FROM CaSi WHERE ID = ?";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(model_CaSi cs) {
        //Nhạc chán quá :v
        String sql = "UPDATE CaSi SET TenCaSi = ?, QueQuan = ?, Tuoi = ?, GioiTinh = ? WHERE ID = ?";
        // vì id để lable ko cho chọn lấy txtID nên dùng cách sửa bằng bấm vào table nhá
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, cs.getTenString());
            ps.setString(2, cs.getQueQuanString());
            ps.setInt(3, cs.getTuoi());
            ps.setInt(4, cs.getGioiTinh());
            ps.setInt(5, cs.getId());
            ps.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
