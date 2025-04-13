//package com.example.ProductMicroservice.Product_Microservice;
//
//import com.example.ProductMicroservice.Product_Microservice.Entity.Address;
//import com.example.ProductMicroservice.Product_Microservice.Entity.User;
//import com.example.ProductMicroservice.Product_Microservice.Repositores.AddressRepo;
//import com.example.ProductMicroservice.Product_Microservice.Repositores.UserRepo;
//import com.example.ProductMicroservice.Product_Microservice.service.AddressService;
//import com.example.ProductMicroservice.Product_Microservice.service.ApplicationService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockedStatic;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.mockStatic;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class ProductMicroserviceApplicationTests {
//	@Mock
//	UserRepo userRepo;
//
//	@Mock
//	AddressRepo addressRepo;
//
//	@InjectMocks
//	AddressService addressService;
//
//  static User user;
//
// @BeforeAll
// static void setUp(){
//	 user = new User();
//	 user.setId(1);
//	 user.setAge("24");
//	 user.setName("jenob");
//	 user.setAddress(null);
//	 user.setApplicationList(null);
// }
//	@Test
//	void addUserShouldAddSuccessfully(){
//
//		when(addressService.addUser(user)).thenReturn(user);
//		User addUser=addressService.addUser(user);
//		Assertions.assertEquals(2,user.getId());
//	}
//	@Test
//	void setAddressService(){
//		Address address= new Address("kochi",null);
//		when(userRepo.findUserById(1L)).thenReturn(Optional.of(user));
//		when(addressRepo.save(any(Address.class))).thenReturn(address);
//		Address testUser=addressService.addAddress(1L,address);
//		Assertions.assertEquals(address.getId(),testUser.getId());
//	}
//
//	@Test
//	void setNullCheck(){
//		Address address= new Address("kochi",null);
//		when(userRepo.findUserById(1L)).thenReturn(Optional.empty());
//		Address testUser=addressService.addAddress(1L,address);
//		Assertions.assertNull(testUser);
//	}
//	@Test
////	void getUserPositiveTest(){
////	 when(userRepo.findUserById(1L)).thenReturn(Optional.of(user));
////	 User current_user=addressService.getUser(1L);
////	 Assertions.assertEquals(current_user,user);
////	}
//
//	@Test
//	void getUserNegativeTest(){
//		when(userRepo.findUserById(1L)).thenThrow(new RuntimeException("User is not found"));
//		RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
//			addressService.getUser(1L);
//		});
//		Assertions.assertEquals("User is not found",thrown.getMessage());
//
//	}
//
//
//}
