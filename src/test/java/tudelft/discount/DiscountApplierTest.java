package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountApplierTest {

    @Test
    public void testSetNewPricesForBusiness() {
        // Crear productos de prueba
        Product businessProduct = new Product("PC", 1000, "BUSINESS");

        // Crear mock de ProductDao
        ProductDao dao = Mockito.mock(ProductDao.class);

        // Configurar el mock para devolver la lista de productos
        List<Product> products = new ArrayList<>();
        products.add(businessProduct);
        Mockito.when(dao.all()).thenReturn(products);

        // Crear instancia de DiscountApplier
        DiscountApplier discountApplier = new DiscountApplier(dao);

        // Aplicar los nuevos precios
        discountApplier.setNewPrices();

        // Verificar que el precio haya aumentado al 110%
        assertEquals(1100, businessProduct.getPrice(), 0.01);
    }

    @Test
    public void testSetNewPricesForHome() {
        // Crear productos de prueba
        Product homeProduct = new Product("Couch", 1000, "HOME");

        // Crear mock de ProductDao
        ProductDao dao = Mockito.mock(ProductDao.class);

        // Configurar el mock para devolver la lista de productos
        List<Product> products = new ArrayList<>();
        products.add(homeProduct);
        Mockito.when(dao.all()).thenReturn(products);

        // Crear instancia de DiscountApplier
        DiscountApplier discountApplier = new DiscountApplier(dao);

        // Aplicar los nuevos precios
        discountApplier.setNewPrices();

        // Verificar que el precio haya disminuido al 90%
        assertEquals(900, homeProduct.getPrice(), 0.01);
    }

    @Test
    public void testNoPriceChangeForOtherCategories() {
        // Crear productos de prueba
        Product otherProduct = new Product("Shirt", 500, "OTHER");

        // Crear mock de ProductDao
        ProductDao dao = Mockito.mock(ProductDao.class);

        // Configurar el mock para devolver la lista de productos
        List<Product> products = new ArrayList<>();
        products.add(otherProduct);
        Mockito.when(dao.all()).thenReturn(products);

        // Crear instancia de DiscountApplier
        DiscountApplier discountApplier = new DiscountApplier(dao);

        // Aplicar los nuevos precios
        discountApplier.setNewPrices();

        // Verificar que el precio no haya cambiado
        assertEquals(500, otherProduct.getPrice(), 0.01);
    }
}
