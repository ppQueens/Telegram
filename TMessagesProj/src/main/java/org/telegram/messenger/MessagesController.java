        for (int i : UserConfig.getActivatedAccounts()) {
            for (int a : UserConfig.getActivatedAccounts()) {
                for (int a : UserConfig.getActivatedAccounts()) {
        for (int a : UserConfig.getActivatedAccounts()) {
        for (int i = 0; i < UserConfig.MAX_ACCOUNT_COUNT; i++) {
            for (int a = 0; a < UserConfig.MAX_ACCOUNT_COUNT; a++) {
                for (int a = 0; a < UserConfig.MAX_ACCOUNT_COUNT; a++) {
        for (int a = 0; a < UserConfig.MAX_ACCOUNT_COUNT; a++) {
            for (int a : UserConfig.getActivatedAccounts()) {
                if (a != currentAccount) {
                    req.other_uids.add(UserConfig.getInstance(a).getClientUserId());
                for (int a : UserConfig.getActivatedAccounts()) {
                    if (a != currentAccount) {
        for (int a : UserConfig.getActivatedAccounts()) {
            if (a != currentAccount) {
                long uid = UserConfig.getInstance(a).getClientUserId();
            for (int a = 0; a < UserConfig.MAX_ACCOUNT_COUNT; a++) {
                UserConfig userConfig = UserConfig.getInstance(a);
                if (a != currentAccount && userConfig.isClientActivated()) {
                    req.other_uids.add(userConfig.getClientUserId());
                for (int a = 0; a < UserConfig.MAX_ACCOUNT_COUNT; a++) {
                    UserConfig userConfig = UserConfig.getInstance(a);
                    if (a != currentAccount && userConfig.isClientActivated()) {
        for (int a = 0; a < UserConfig.MAX_ACCOUNT_COUNT; a++) {
            UserConfig userConfig = UserConfig.getInstance(a);
            if (a != currentAccount && userConfig.isClientActivated()) {
                long uid = userConfig.getClientUserId();
