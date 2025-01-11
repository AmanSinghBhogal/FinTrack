INSERT INTO USERS (uid, name, password, age, gender, wallet, email, mob, cur) VALUES
(UUID(), 'John Doe', 'hashedpassword1', 25, 'M', 1000.0, 'johndoe@example.com', '1234567890', 'INR'),
(UUID(), 'Jane Smith', 'hashedpassword2', 30, 'F', 1500.0, 'janesmith@example.com', '1234567891', 'INR'),
(UUID(), 'Sam Brown', 'hashedpassword3', 28, 'M', 800.0, 'sambrown@example.com', '1234567892', 'INR'),
(UUID(), 'Lisa Ray', 'hashedpassword4', 22, 'F', 1200.0, 'lisaray@example.com', '1234567893', 'INR'),
(UUID(), 'Tom White', 'hashedpassword5', 32, 'M', 900.0, 'tomwhite@example.com', '1234567894', 'INR'),
(UUID(), 'Emma Stone', 'hashedpassword6', 27, 'F', 1100.0, 'emmastone@example.com', '1234567895', 'INR'),
(UUID(), 'Alex Black', 'hashedpassword7', 35, 'M', 1400.0, 'alexblack@example.com', '1234567896', 'INR'),
(UUID(), 'Mia Green', 'hashedpassword8', 26, 'F', 1050.0, 'miagreen@example.com', '1234567897', 'INR'),
(UUID(), 'Chris Blue', 'hashedpassword9', 29, 'M', 950.0, 'chrisblue@example.com', '1234567898', 'INR'),
(UUID(), 'Sophia Grey', 'hashedpassword10', 24, 'F', 1300.0, 'sophiagrey@example.com', '1234567899', 'INR');

INSERT INTO BUDGET_ALLOC (bid, uid, year, month, rent, water, electricity, travel, entertainment, medical, debt, food, savings, investment, mob_internet, shopping, income) VALUES
(UUID(), (SELECT uid FROM USERS LIMIT 1), 2024, 'Jan', 500, 50, 100, 150, 75, 200, 300, 250, 400, 150, 50, 100, 2000),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 1), 2024, 'Feb', 600, 60, 110, 160, 80, 210, 310, 260, 410, 160, 60, 110, 2100),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 2), 2024, 'Mar', 550, 55, 105, 155, 78, 205, 305, 255, 405, 155, 55, 105, 2050),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 3), 2024, 'Apr', 520, 52, 102, 152, 76, 202, 302, 252, 402, 152, 52, 102, 2020),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 4), 2024, 'May', 570, 57, 107, 157, 79, 207, 307, 257, 407, 157, 57, 107, 2070),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 5), 2024, 'Jun', 530, 53, 103, 153, 77, 203, 303, 253, 403, 153, 53, 103, 2030),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 6), 2024, 'Jul', 580, 58, 108, 158, 81, 208, 308, 258, 408, 158, 58, 108, 2080),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 7), 2024, 'Aug', 540, 54, 104, 154, 78, 204, 304, 254, 404, 154, 54, 104, 2040),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 8), 2024, 'Sep', 590, 59, 109, 159, 82, 209, 309, 259, 409, 159, 59, 109, 2090),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 9), 2024, 'Oct', 560, 56, 106, 156, 80, 206, 306, 256, 406, 156, 56, 106, 2060);

INSERT INTO Expense (eid, uid, date, dineout, vegetable, dairy, fruits, meat, travel, personal, entertainment, cloths, furniture, electronics, grooming, other) VALUES
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2024-01-01', 20, 15, 10, 8, 12, 30, 25, 20, 15, 10, 35, 5, 10),
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2024-01-02', 20, 15, 10, 8, 12, 30, 25, 20, 15, 10, 35, 5, 10),
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2024-02-01', 20, 15, 10, 8, 12, 30, 25, 20, 15, 10, 35, 5, 10),
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2023-02-01', 20, 15, 10, 8, 12, 30, 25, 20, 15, 10, 35, 5, 10),
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2023-01-01', 20, 15, 10, 8, 12, 30, 25, 20, 15, 10, 35, 5, 10),
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2024-05-22', 20, 15, 10, 8, 12, 30, 25, 20, 15, 10, 35, 5, 10),
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2024-12-05', 20, 15, 10, 8, 12, 30, 25, 20, 15, 10, 35, 5, 10),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 1), '2024-01-02', 22, 16, 11, 9, 13, 32, 26, 21, 16, 11, 36, 6, 11),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 2), '2024-01-03', 24, 18, 12, 10, 14, 34, 27, 22, 17, 12, 37, 7, 12),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 3), '2024-01-04', 26, 20, 13, 11, 15, 36, 28, 23, 18, 13, 38, 8, 13),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 4), '2024-01-05', 28, 21, 14, 12, 16, 38, 29, 24, 19, 14, 39, 9, 14),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 5), '2024-01-06', 30, 23, 15, 13, 17, 40, 30, 25, 20, 15, 40, 10, 15),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 6), '2024-01-07', 32, 24, 16, 14, 18, 42, 31, 26, 21, 16, 41, 11, 16),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 7), '2024-01-08', 34, 26, 17, 15, 19, 44, 32, 27, 22, 17, 42, 12, 17),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 8), '2024-01-09', 36, 27, 18, 16, 20, 46, 33, 28, 23, 18, 43, 13, 18),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 9), '2024-01-10', 38, 29, 19, 17, 21, 48, 34, 29, 24, 19, 44, 14, 19);

INSERT INTO Expenses_desc (edid, uid, date, dineout_desc, vegetable_desc, dairy_desc, fruits_desc, meat_desc, travel_desc, personal_desc, entertainment_desc, cloths_desc, furniture_desc, electronics_desc, grooming_desc, other_desc) VALUES
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2024-01-01', 'Lunch with friends', 'Grocery shopping', 'Milk and yogurt', 'Apples and bananas', 'Chicken breast', 'Bus fare', 'Personal items', 'Movie night', 'Casual T-shirt', 'Desk chair', 'Phone charger', 'Haircut', 'Miscellaneous'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 1), '2024-01-02', 'Dinner at restaurant', 'Fresh vegetables', 'Cheese block', 'Oranges and berries', 'Beef steak', 'Taxi fare', 'Skincare products', 'Concert ticket', 'Winter jacket', 'Coffee table', 'USB cable', 'Salon visit', 'Home supplies'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 2), '2024-01-03', 'Brunch outing', 'Organic vegetables', 'Butter and cream', 'Mixed fruits', 'Fish', 'Train ticket', 'Toiletries', 'Sports event', 'Running shoes', 'Side table', 'Wireless earphones', 'Shaving kit', 'Pet food'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 3), '2024-01-04', 'Quick snack', 'Canned veggies', 'Greek yogurt', 'Pineapple', 'Pork', 'Bus pass', 'Cosmetics', 'Amusement park', 'Formal shirt', 'Shelf', 'Laptop charger', 'Hair styling', 'Stationery'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 4), '2024-01-05', 'Family dinner', 'Bulk vegetables', 'Milk carton', 'Mangoes', 'Lamb chops', 'Car rental', 'Spa kit', 'Comedy show', 'Jeans', 'Bookshelf', 'Screen protector', 'Facial kit', 'Cleaning supplies'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 5), '2024-01-06', 'Evening tea', 'Leafy greens', 'Almond milk', 'Strawberries', 'Turkey', 'Bicycle hire', 'Fitness gear', 'Art exhibit', 'Blazer', 'Lamp', 'Power bank', 'Manicure', 'Gardening tools'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 6), '2024-01-07', 'Café outing', 'Exotic vegetables', 'Sour cream', 'Papaya', 'Shrimp', 'Flight ticket', 'Gym accessories', 'Opera ticket', 'Raincoat', 'Stool', 'Smartwatch band', 'Foot massage', 'Kitchenware'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 7), '2024-01-08', 'Takeaway lunch', 'Frozen vegetables', 'Soy milk', 'Watermelon', 'Duck meat', 'Metro pass', 'Health supplements', 'Karaoke night', 'Scarf', 'Couch', 'Portable speaker', 'Face wash', 'Office supplies'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 8), '2024-01-09', 'Street food', 'Root vegetables', 'Oat milk', 'Grapes', 'Salmon', 'Bus fare', 'Perfume', 'Music festival', 'Socks', 'Dresser', 'Bluetooth adapter', 'Hand cream', 'Baking supplies'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 9), '2024-01-10', 'Birthday celebration', 'Fresh herbs', 'Lactose-free milk', 'Peaches', 'Crab', 'Uber ride', 'Lip balm', 'Stand-up comedy', 'Sneakers', 'Mirror', 'Headphones', 'Beard oil', 'DIY tools');

INSERT INTO Fixed_Charges (fid, uid, date, rent, water, electricity, internet, investment, savings, debt, gas) VALUES
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2024-01-01', 1000, 50, 120, 60, 300, 500, 100, 30),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 1), '2024-01-02', 1050, 55, 130, 65, 310, 510, 110, 35),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 2), '2024-01-03', 1020, 52, 125, 62, 320, 520, 120, 40),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 3), '2024-01-04', 1080, 58, 135, 68, 330, 530, 130, 45),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 4), '2024-01-05', 1030, 53, 128, 63, 340, 540, 115, 50),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 5), '2024-01-06', 1040, 54, 132, 66, 350, 550, 105, 55),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 6), '2024-01-07', 1090, 59, 138, 69, 360, 560, 115, 60),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 7), '2024-01-08', 1070, 57, 140, 64, 370, 570, 125, 65),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 8), '2024-01-09', 1060, 56, 127, 61, 380, 580, 135, 70),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 9), '2024-01-10', 1100, 60, 140, 70, 390, 590, 140, 75);

INSERT INTO Investment (iid, uid, date, name, category, description) VALUES
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2024-01-01', 'ABC Real Estate', 'Real Estate', 'Residential property investment in downtown area'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 1), '2024-01-02', 'Gold Holdings', 'Gold', 'Investment in physical gold bars and coins'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 2), '2024-01-03', 'Digital Gold Platform', 'Digital Gold', 'Purchase of digital gold through online platform'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 3), '2024-01-04', 'Bitcoin', 'Cryptocurrency', 'Investment in Bitcoin for long-term growth'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 4), '2024-01-05', 'Government Bonds', 'Bonds', 'Investment in 10-year government bonds with fixed interest'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 5), '2024-01-06', 'Blue Chip Stocks', 'Stocks', 'Stocks in high-value companies with good dividend yields'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 6), '2024-01-07', 'Mutual Funds - Equity', 'Funds', 'Equity mutual fund for high returns over time'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 7), '2024-01-08', 'Property in Suburb', 'Real Estate', 'Residential plot in suburban area for development'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 8), '2024-01-09', 'Silver Investment', 'Gold', 'Investment in physical silver as a commodity hedge'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 9), '2024-01-10', 'Tech Startup Shares', 'Stocks', 'Investment in a tech startup with potential for high growth');

-- Expense_desc new changes

-- Creating Expenses_desc Table:
CREATE TABLE IF NOT EXISTS Expenses_desc (
    edid VARCHAR(36) PRIMARY KEY,
	uid VARCHAR(36),
    date DATE,
    dineout_desc VARCHAR(500),
    vegetable_desc VARCHAR(500),
    dairy_desc VARCHAR(500),
    fruits_desc VARCHAR(500),
    meat_desc VARCHAR(500),
    travel_desc VARCHAR(500),
    personal_desc VARCHAR(500),
    entertainment_desc VARCHAR(500),
    cloths_desc VARCHAR(500),
    furniture_desc VARCHAR(500),
    electronics_desc VARCHAR(500),
    grooming_desc VARCHAR(500),
    other_desc VARCHAR(500),
    FOREIGN KEY (edid) REFERENCES expense(eid)
);


INSERT INTO Expenses_desc (edid, uid, date, dineout_desc, vegetable_desc, dairy_desc, fruits_desc, meat_desc, travel_desc, personal_desc, entertainment_desc, cloths_desc, furniture_desc, electronics_desc, grooming_desc, other_desc) VALUES
('af305784-9e8e-11ef-823d-0897986f1b67', '80b67db3-9e8d-11ef-823d-0897986f1b67', '2024-01-02', 'Lunch with friends', 'Grocery shopping', 'Milk and yogurt', 'Apples and bananas', 'Chicken breast', 'Bus fare', 'Personal items', 'Movie night', 'Casual T-shirt', 'Desk chair', 'Phone charger', 'Haircut', 'Miscellaneous'),
('af30652a-9e8e-11ef-823d-0897986f1b67', '80b686df-9e8d-11ef-823d-0897986f1b67', '2024-01-03', 'Dinner at restaurant', 'Fresh vegetables', 'Cheese block', 'Oranges and berries', 'Beef steak', 'Taxi fare', 'Skincare products', 'Concert ticket', 'Winter jacket', 'Coffee table', 'USB cable', 'Salon visit', 'Home supplies'),
('af3067c4-9e8e-11ef-823d-0897986f1b67', '80b687c3-9e8d-11ef-823d-0897986f1b67', '2024-01-04', 'Brunch outing', 'Organic vegetables', 'Butter and cream', 'Mixed fruits', 'Fish', 'Train ticket', 'Toiletries', 'Sports event', 'Running shoes', 'Side table', 'Wireless earphones', 'Shaving kit', 'Pet food'),
('af306b70-9e8e-11ef-823d-0897986f1b67', '80b6885b-9e8d-11ef-823d-0897986f1b67', '2024-01-05', 'Quick snack', 'Canned veggies', 'Greek yogurt', 'Pineapple', 'Pork', 'Bus pass', 'Cosmetics', 'Amusement park', 'Formal shirt', 'Shelf', 'Laptop charger', 'Hair styling', 'Stationery'),
('af306eaa-9e8e-11ef-823d-0897986f1b67', '80b688bf-9e8d-11ef-823d-0897986f1b67', '2024-01-06', 'Family dinner', 'Bulk vegetables', 'Milk carton', 'Mangoes', 'Lamb chops', 'Car rental', 'Spa kit', 'Comedy show', 'Jeans', 'Bookshelf', 'Screen protector', 'Facial kit', 'Cleaning supplies'),
('af307109-9e8e-11ef-823d-0897986f1b67', '80b68922-9e8d-11ef-823d-0897986f1b67', '2024-01-07', 'Evening tea', 'Leafy greens', 'Almond milk', 'Strawberries', 'Turkey', 'Bicycle hire', 'Fitness gear', 'Art exhibit', 'Blazer', 'Lamp', 'Power bank', 'Manicure', 'Gardening tools'),
('af3073fa-9e8e-11ef-823d-0897986f1b67', '80b68985-9e8d-11ef-823d-0897986f1b67', '2024-01-08', 'Café outing', 'Exotic vegetables', 'Sour cream', 'Papaya', 'Shrimp', 'Flight ticket', 'Gym accessories', 'Opera ticket', 'Raincoat', 'Stool', 'Smartwatch band', 'Foot massage', 'Kitchenware'),
('33d51989-9e8e-11ef-823d-0897986f1b67', '80b68a48-9e8d-11ef-823d-0897986f1b67', '2024-01-09', 'Takeaway lunch', 'Frozen vegetables', 'Soy milk', 'Watermelon', 'Duck meat', 'Metro pass', 'Health supplements', 'Karaoke night', 'Scarf', 'Couch', 'Portable speaker', 'Face wash', 'Office supplies'),
('33d51cc4-9e8e-11ef-823d-0897986f1b67', '80b68aba-9e8d-11ef-823d-0897986f1b67', '2024-01-10', 'Street food', 'Root vegetables', 'Oat milk', 'Grapes', 'Salmon', 'Bus fare', 'Perfume', 'Music festival', 'Socks', 'Dresser', 'Bluetooth adapter', 'Hand cream', 'Baking supplies'),
('33d51f49-9e8e-11ef-823d-0897986f1b67', '80b61586-9e8d-11ef-823d-0897986f1b67', '2024-01-01', 'Birthday celebration', 'Fresh herbs', 'Lactose-free milk', 'Peaches', 'Crab', 'Uber ride', 'Lip balm', 'Stand-up comedy', 'Sneakers', 'Mirror', 'Headphones', 'Beard oil', 'DIY tools'),
('33d52351-9e8e-11ef-823d-0897986f1b67', '80b61586-9e8d-11ef-823d-0897986f1b67', '2024-01-02', 'Street food', 'Root vegetables', 'Oat milk', 'Grapes', 'Salmon', 'Bus fare', 'Perfume', 'Music festival', 'Socks', 'Dresser', 'Bluetooth adapter', 'Hand cream', 'Baking supplies'),
('33d527e3-9e8e-11ef-823d-0897986f1b67', '80b61586-9e8d-11ef-823d-0897986f1b67', '2023-02-01', 'Street food', 'Root vegetables', 'Oat milk', 'Grapes', 'Salmon', 'Bus fare', 'Perfume', 'Music festival', 'Socks', 'Dresser', 'Bluetooth adapter', 'Hand cream', 'Baking supplies'),
('33d52aaf-9e8e-11ef-823d-0897986f1b67', '80b61586-9e8d-11ef-823d-0897986f1b67', '2023-02-01', 'Street food', 'Root vegetables', 'Oat milk', 'Grapes', 'Salmon', 'Bus fare', 'Perfume', 'Music festival', 'Socks', 'Dresser', 'Bluetooth adapter', 'Hand cream', 'Baking supplies'),
('33d52dd0-9e8e-11ef-823d-0897986f1b67', '80b61586-9e8d-11ef-823d-0897986f1b67', '2023-01-01', 'Street food', 'Root vegetables', 'Oat milk', 'Grapes', 'Salmon', 'Bus fare', 'Perfume', 'Music festival', 'Socks', 'Dresser', 'Bluetooth adapter', 'Hand cream', 'Baking supplies'),
('33d530b5-9e8e-11ef-823d-0897986f1b67', '80b61586-9e8d-11ef-823d-0897986f1b67', '2024-05-22', 'Street food', 'Root vegetables', 'Oat milk', 'Grapes', 'Salmon', 'Bus fare', 'Perfume', 'Music festival', 'Socks', 'Dresser', 'Bluetooth adapter', 'Hand cream', 'Baking supplies'),
('33d53439-9e8e-11ef-823d-0897986f1b67', '80b61586-9e8d-11ef-823d-0897986f1b67', '2024-12-05', 'Street food', 'Root vegetables', 'Oat milk', 'Grapes', 'Salmon', 'Bus fare', 'Perfume', 'Music festival', 'Socks', 'Dresser', 'Bluetooth adapter', 'Hand cream', 'Baking supplies');
