-- Using this newly created database:
USE FinTrack_Dev;

INSERT INTO USERS (uid, name, password, age, gender, wallet, email, mob, cur) VALUES
('2e5b5a2b-e151-11ef-8d18-0897986f1b67', 'John Doe', 'hashedpassword1', 25, 'M', '1000.0', 'johndoe@example.com', '1234567890', 'INR'),
('2e5bb568-e151-11ef-8d18-0897986f1b67', 'Jane Smith', 'hashedpassword2', 30, 'F', '1500.0', 'janesmith@example.com', '1234567891', 'INR'),
('2e5bbb63-e151-11ef-8d18-0897986f1b67', 'Sam Brown', 'hashedpassword3', 28, 'M', '800.0', 'sambrown@example.com', '1234567892', 'INR'),
('2e5bbcd4-e151-11ef-8d18-0897986f1b67', 'Lisa Ray', 'hashedpassword4', 22, 'F', '1200.0', 'lisaray@example.com', '1234567893', 'INR'),
('2e5bbddc-e151-11ef-8d18-0897986f1b67', 'Tom White', 'hashedpassword5', 32, 'M', '900.0', 'tomwhite@example.com', '1234567894', 'INR'),
('2e5bbed4-e151-11ef-8d18-0897986f1b67', 'Emma Stone', 'hashedpassword6', 27, 'F', '1100.0', 'emmastone@example.com', '1234567895', 'INR'),
('2e5bc274-e151-11ef-8d18-0897986f1b67', 'Alex Black', 'hashedpassword7', 35, 'M', '1400.0', 'alexblack@example.com', '1234567896', 'INR'),
('2e5bc4a8-e151-11ef-8d18-0897986f1b67', 'Mia Green', 'hashedpassword8', 26, 'F', '1050.0', 'miagreen@example.com', '1234567897', 'INR'),
('2e5bc62c-e151-11ef-8d18-0897986f1b67', 'Chris Blue', 'hashedpassword9', 29, 'M', '950.0', 'chrisblue@example.com', '1234567898', 'INR'),
('2e5bc778-e151-11ef-8d18-0897986f1b67', 'Sophia Grey', 'hashedpassword10', 24, 'F', '1300.0', 'sophiagrey@example.com', '1234567899', 'INR');

INSERT INTO BUDGET_ALLOC (bid, uid, year, month, rent, water, electricity, travel, entertainment, medical, debt, food, savings, investment, mob_internet, shopping, income) VALUES
(UUID(), (SELECT uid FROM USERS LIMIT 1), 2024, 'Jan', '500', '50', '100', '150', '75', '200', '300', '250', '400', '150', '50', '100', '2000'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 1), 2024, 'Feb', '600', '60', '110', '160', '80', '210', '310', '260', '410', '160', '60', '110', '2100'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 2), 2024, 'Mar', '550', '55', '105', '155', '78', '205', '305', '255', '405', '155', '55', '105', '2050'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 3), 2024, 'Apr', '520', '52', '102', '152', '76', '202', '302', '252', '402', '152', '52', '102', '2020'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 4), 2024, 'May', '570', '57', '107', '157', '79', '207', '307', '257', '407', '157', '57', '107', '2070'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 5), 2024, 'Jun', '530', '53', '103', '153', '77', '203', '303', '253', '403', '153', '53', '103', '2030'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 6), 2024, 'Jul', '580', '58', '108', '158', '81', '208', '308', '258', '408', '158', '58', '108', '2080'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 7), 2024, 'Aug', '540', '54', '104', '154', '78', '204', '304', '254', '404', '154', '54', '104', '2040'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 8), 2024, 'Sep', '590', '59', '109', '159', '82', '209', '309', '259', '409', '159', '59', '109', '2090'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 9), 2024, 'Oct', '560', '56', '106', '156', '80', '206', '306', '256', '406', '156', '56', '106', '2060');

INSERT INTO Expenses_desc (edid, uid, date, dineout_desc, vegetable_desc, dairy_desc, fruits_desc, meat_desc, travel_desc, personal_desc, entertainment_desc, cloths_desc, furniture_desc, electronics_desc, grooming_desc, other_desc) VALUES
('2e5f3394-e151-11ef-8d18-0897986f1b67', '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2024-01-01', 'Lunch with friends', 'Grocery shopping', 'Milk and yogurt', 'Apples and bananas', 'Chicken breast', 'Bus fare', 'Personal items', 'Movie night', 'Casual T-shirt', 'Desk chair', 'Phone charger', 'Haircut', 'Miscellaneous'),
('2e5f3394-e151-12ef-8d18-0897986f1b67', '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2024-01-02', 'Dinner at restaurant', 'Fresh vegetables', 'Cheese block', 'Oranges and berries', 'Beef steak', 'Taxi fare', 'Skincare products', 'Concert ticket', 'Winter jacket', 'Coffee table', 'USB cable', 'Salon visit', 'Home supplies'),
('2e5f3394-e151-13ef-8d18-0897986f1b67', '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2024-02-01', 'Brunch outing', 'Organic vegetables', 'Butter and cream', 'Mixed fruits', 'Fish', 'Train ticket', 'Toiletries', 'Sports event', 'Running shoes', 'Side table', 'Wireless earphones', 'Shaving kit', 'Pet food'),
('2e5f3394-e151-14ef-8d18-0897986f1b67', '2e5bbcd4-e151-11ef-8d18-0897986f1b67', '2024-02-04', 'Quick snack', 'Canned veggies', 'Greek yogurt', 'Pineapple', 'Pork', 'Bus pass', 'Cosmetics', 'Amusement park', 'Formal shirt', 'Shelf', 'Laptop charger', 'Hair styling', 'Stationery'),
('2e5f3394-e151-15ef-8d18-0897986f1b67', '2e5bbcd4-e151-11ef-8d18-0897986f1b67', '2023-01-05', 'Family dinner', 'Bulk vegetables', 'Milk carton', 'Mangoes', 'Lamb chops', 'Car rental', 'Spa kit', 'Comedy show', 'Jeans', 'Bookshelf', 'Screen protector', 'Facial kit', 'Cleaning supplies'),
('2e5f3394-e151-16ef-8d18-0897986f1b67', '2e5bc274-e151-11ef-8d18-0897986f1b67', '2024-05-22', 'Evening tea', 'Leafy greens', 'Almond milk', 'Strawberries', 'Turkey', 'Bicycle hire', 'Fitness gear', 'Art exhibit', 'Blazer', 'Lamp', 'Power bank', 'Manicure', 'Gardening tools'),
('2e5f3394-e151-17ef-8d18-0897986f1b67', '2e5bc274-e151-11ef-8d18-0897986f1b67', '2024-12-05', 'Café outing', 'Exotic vegetables', 'Sour cream', 'Papaya', 'Shrimp', 'Flight ticket', 'Gym accessories', 'Opera ticket', 'Raincoat', 'Stool', 'Smartwatch band', 'Foot massage', 'Kitchenware'),
('2e5f3394-e151-18ef-8d18-0897986f1b67', '2e5bc274-e151-11ef-8d18-0897986f1b67', '2024-01-08', 'Takeaway lunch', 'Frozen vegetables', 'Soy milk', 'Watermelon', 'Duck meat', 'Metro pass', 'Health supplements', 'Karaoke night', 'Scarf', 'Couch', 'Portable speaker', 'Face wash', 'Office supplies'),
('2e5f3394-e151-19ef-8d18-0897986f1b67', '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2024-09-22', 'Street food', 'Root vegetables', 'Oat milk', 'Grapes', 'Salmon', 'Bus fare', 'Perfume', 'Music festival', 'Socks', 'Dresser', 'Bluetooth adapter', 'Hand cream', 'Baking supplies'),
('2e5f3394-e151-20ef-8d18-0897986f1b67', '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2024-10-15', 'Birthday celebration', 'Fresh herbs', 'Lactose-free milk', 'Peaches', 'Crab', 'Uber ride', 'Lip balm', 'Stand-up comedy', 'Sneakers', 'Mirror', 'Headphones', 'Beard oil', 'DIY tools');

INSERT INTO Expense (eid, uid, edid, date, dineout, vegetable, dairy, fruits, meat, travel, personal, entertainment, cloths, furniture, electronics, grooming, other) VALUES
(UUID(), '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-11ef-8d18-0897986f1b67', '2024-01-01', '20', '15', '10', '8', '12', '30', '25', '20', '15', '10', '35', '5', '10'),
(UUID(), '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-12ef-8d18-0897986f1b67', '2024-01-02', '20', '15', '10', '8', '12', '30', '25', '20', '15', '10', '35', '5', '10'),
(UUID(), '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-13ef-8d18-0897986f1b67', '2024-02-01', '20', '15', '10', '8', '12', '30', '25', '20', '15', '10', '35', '5', '10'),
(UUID(), '2e5bbcd4-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-14ef-8d18-0897986f1b67', '2023-02-04', '20', '15', '10', '8', '12', '30', '25', '20', '15', '10', '35', '5', '10'),
(UUID(), '2e5bbcd4-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-15ef-8d18-0897986f1b67', '2023-01-05', '20', '15', '10', '8', '12', '30', '25', '20', '15', '10', '35', '5', '10'),
(UUID(), '2e5bc274-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-16ef-8d18-0897986f1b67', '2024-05-22', '20', '15', '10', '8', '12', '30', '25', '20', '15', '10', '35', '5', '10'),
(UUID(), '2e5bc274-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-17ef-8d18-0897986f1b67', '2024-12-05', '20', '15', '10', '8', '12', '30', '25', '20', '15', '10', '35', '5', '10'),
(UUID(), '2e5bc274-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-18ef-8d18-0897986f1b67', '2024-01-08', '22', '16', '11', '9', '13', '32', '26', '21', '16', '11', '36', '6', '11'),
(UUID(), '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-19ef-8d18-0897986f1b67', '2024-09-22', '24', '18', '12', '10', '14', '34', '27', '22', '17', '12', '37', '7', '12'),
(UUID(), '2e5b5a2b-e151-11ef-8d18-0897986f1b67', '2e5f3394-e151-20ef-8d18-0897986f1b67', '2024-10-15', '24', '18', '12', '10', '14', '34', '27', '22', '17', '12', '37', '7', '12');


INSERT INTO Fixed_Charges (fid, uid, date, rent, water, electricity, internet, investment, savings, debt, gas) VALUES
(UUID(), (SELECT uid FROM USERS LIMIT 1), '2024-01-01', '1000', '50', '120', '60', '300', '500', '100', '30'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 1), '2024-01-02', '1050', '55', '130', '65', '310', '510', '110', '35'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 2), '2024-01-03', '1020', '52', '125', '62', '320', '520', '120', '40'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 3), '2024-01-04', '1080', '58', '135', '68', '330', '530', '130', '45'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 4), '2024-01-05', '1030', '53', '128', '63', '340', '540', '115', '50'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 5), '2024-01-06', '1040', '54', '132', '66', '350', '550', '105', '55'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 6), '2024-01-07', '1090', '59', '138', '69', '360', '560', '115', '60'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 7), '2024-01-08', '1070', '57', '140', '64', '370', '570', '125', '65'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 8), '2024-01-09', '1060', '56', '127', '61', '380', '580', '135', '70'),
(UUID(), (SELECT uid FROM USERS LIMIT 1 OFFSET 9), '2024-01-10', '1100', '60', '140', '70', '390', '590', '140', '75');

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

