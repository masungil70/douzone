package clean.code.design7.abstract_factory_pattern.step1;

enum ProductType {
	SAMSUNG_PRODUCT, LG_PRODUCT
}

interface Keyboard {
};

class SamsungKeyboard implements Keyboard {
	private SamsungKeyboard() {
		System.out.println("SamsungKeyboard");
	}

	public static Keyboard createObject() {
		return new SamsungKeyboard();
	}
}

class LGKeyboard implements Keyboard {
	private LGKeyboard() {
		System.out.println("LGKeyboard");
	}

	public static Keyboard createObject() {
		return new LGKeyboard();
	}
}

interface Mouse {
}

class SamsungMouse implements Mouse {
	private SamsungMouse() {
		System.out.println("SamsungMouse");
	}
	
	public static Mouse createObject() {
		return new SamsungMouse();
	}	
}

class LGMouse implements Mouse {
	private LGMouse() {
		System.out.println("LGMouse");
	}
	public static Mouse createObject() {
		return new LGMouse();
	}	
}


interface Monitor {
}

class SamsungMonitor implements Monitor {
	private SamsungMonitor() {
        System.out.println("SamsungMonitor");
    }
	public static Monitor createObject() {
		return new SamsungMonitor();
	}	
}

class LGMonitor implements Monitor {
	private LGMonitor() {
        System.out.println("LGMonitor");
    }
	public static Monitor createObject() {
		return new LGMonitor();
	}	
}

//class KeyboardFactory {
//
//	public static Keyboard createMouse(ProductType type) {
//        switch (type) {
//        case SAMSUNG_PRODUCT:
//            return SamsungKeyboard.createObject();
//        case LG_PRODUCT:
//            return LGKeyboard.createObject();
//        }
//        throw new Exception("키보드 제품이 없습니다");
//    }
//}
//
//
//class MouseFactory {
//
//	public static Mouse createMouse(ProductType type) {
//        switch (type) {
//        case SAMSUNG_PRODUCT:
//            return SamsungMouse.createObject();
//        case LG_PRODUCT:
//            return LGMouse.createObject();
//        }
//        throw new Exception("마우스 제품이 없습니다");
//    }
//}
//
//
//class MonitorFactory {
//	public static Monitor createMonitor(ProductType type) {
//        switch (type) {
//        case SAMSUNG_PRODUCT:
//            return SamsungMonitor.createObject();
//        case LG_PRODUCT:
//            return LGMonitor.createObject();
//        }
//        throw new Exception("모니터 제품이 없습니다");
//    }
//}

interface ComputerFactory {
	Keyboard createKeyboard();
    Mouse createMouse();
    Monitor createMonitor();
}

class SamsungComputerFactory  implements ComputerFactory {
	public Keyboard createKeyboard() {
        return SamsungKeyboard.createObject();
    }
	
	public Mouse createMouse() {
        return SamsungMouse.createObject();
    }
	
	public Monitor createMonitor() {
        return SamsungMonitor.createObject();
    }
}

class LGComputerFactory implements ComputerFactory {
	public Keyboard createKeyboard() {
        return LGKeyboard.createObject();
    }
	
	public Mouse createMouse() {
        return LGMouse.createObject();
    }
	
	public Monitor createMonitor() {
        return LGMonitor.createObject();
    }
}


class ComputerProductFactory {
	public static ComputerFactory createComputer(ProductType type) throws Exception {
        switch (type) {
        case SAMSUNG_PRODUCT:
            return new SamsungComputerFactory();
        case LG_PRODUCT:
            return new LGComputerFactory();
        }
        throw new Exception("컴퓨터 생성 방법이 존재하지 않습니다 ");
	}
}

public class FactoryPattern {
	public static void main(String[] args) {
		try {
		    ComputerFactory computerFactory = ComputerProductFactory.createComputer(ProductType.LG_PRODUCT);
		    Keyboard keyboard = computerFactory.createKeyboard();
		    Mouse mouse = computerFactory.createMouse();
		    Monitor monitor = computerFactory.createMonitor();
		
		}catch (Exception e) {
			 e.printStackTrace();
		}
		
	}
}