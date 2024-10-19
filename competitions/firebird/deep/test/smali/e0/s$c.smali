.class public Le0/s$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Le0/s;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Le0/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le0/s;-><init>(Le0/s;)V

    invoke-direct {p0, v0}, Le0/s$c;-><init>(Le0/s;)V

    return-void
.end method

.method public constructor <init>(Le0/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/s$c;->a:Le0/s;

    return-void
.end method


# virtual methods
.method public a()Le0/s;
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public b(Lx/b;)V
    .locals 0

    return-void
.end method

.method public c(Lx/b;)V
    .locals 0

    const p0, 0x0

    throw p0
.end method
