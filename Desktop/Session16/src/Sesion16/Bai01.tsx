function SubjectList() {
  const subjects = ["Toán", "Văn", "Anh", "Hóa", "Sinh"];

  return (
    <div style={{ textAlign: "center", padding: "20px" }}>
      <h1 style={{ color: "black" }}>📚 Danh sách môn học</h1>
      <div style={{ display: "flex", flexDirection: "column", gap: "15px", marginTop: "20px" }}>
        {subjects.map((subject, index) => (
          <div
            key={index}
            style={{
              backgroundColor: "lightblue",
              borderRadius: "10px",
              padding: "15px",
              fontSize: "20px",
              fontWeight: "bold",
              color: "darkblue",
              textAlign: "center",
            }}
          >
            {subject}
          </div>
        ))}
      </div>
    </div>
  );
}

export default SubjectList;