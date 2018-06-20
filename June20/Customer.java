package June20;

public class Customer{
		private Long id;
		private String name;
		private String mobileNumber;

		
		@Override
		public String toString() {
			return "\n" + id + "\t" + name + "\t" + mobileNumber;

		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		
		public Customer() {
			super();
		}
				
		public Customer(Long id, String name, String mobileNumber) {
			super();
			this.id = id;
			this.name = name;
			this.mobileNumber = mobileNumber;
		}
		
		public boolean equals(Object obj) {
			
			if(obj instanceof Customer) {
				Customer other = (Customer)obj;
			
				if(this.id.equals(other.id) &&
						this.name.equals(other.name) &&
						this.mobileNumber.equals(other.mobileNumber)) {
					return true;
				}
			}
			return false;
		}
		
		public int hashCode() {
			return 10;
		}
}
